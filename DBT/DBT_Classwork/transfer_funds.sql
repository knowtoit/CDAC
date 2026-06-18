DROP PROCEDURE IF EXISTS transfer_funds;

DELIMITER //

CREATE PROCEDURE transfer_funds(
IN p_from_acc INT,
IN p_to_acc INT,
IN p_amount INT
)
BEGIN
DECLARE v_balance INT;


START TRANSACTION;

SELECT balance
INTO v_balance
FROM accounts
WHERE acc_no = p_from_acc;

IF v_balance < p_amount THEN
    ROLLBACK;

    SIGNAL SQLSTATE '45000'
    SET MESSAGE_TEXT = 'Insufficient balance';
ELSE
    UPDATE accounts
    SET balance = balance - p_amount
    WHERE acc_no = p_from_acc;

    UPDATE accounts
    SET balance = balance + p_amount
    WHERE acc_no = p_to_acc;

    INSERT INTO transaction_history
    (from_acc, to_acc, amount)
    VALUES
    (p_from_acc, p_to_acc, p_amount);

    COMMIT;
END IF;


END //

DELIMITER ;




