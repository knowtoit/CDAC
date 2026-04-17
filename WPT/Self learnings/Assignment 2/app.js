// Create a JSON object, array, and file to store a cricket match(or any team sport) scoreboard.





const fs = require('fs');
const data = fs.readFileSync('scoreBoard.json', 'utf-8');

const scoreboard = JSON.parse(data);

// console.log(scoreboard);

console.log("Match Details");
console.table(scoreboard.matchDetails);

console.log("Scoreboard");
console.table(scoreboard.Scoreboard);

console.log("Players");
console.table(scoreboard.Players);