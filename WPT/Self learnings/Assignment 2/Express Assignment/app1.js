const express = require('express');
const app = express();

const port = 3000;

app.use(express.urlencoded({extended:true}));

app.get('/', (req, res)=>{
    res.send("<h1> Welcome to Express </h1>");
});

app.get('/about', (req, res)=>{
    res.send("<h1>About US </h1>");
})

app.get('/contact',(req, res)=>{
    res.send("<h1> Contact us at : iet@gmail.com</h1>");
})

app.get('/Form',(req, res)=>{
    res.send(`
        <h2>Enter Details</h2>
        <form method = "POST" action="/submit">
        Name: <input type="text" name="name">
        Mob No: <input type="number" name="number">
        <button type="submit">Submit</button>
        </form>
        `);
});

app.post('/submit', (req, res)=>{
    const name = req.body.name;
    const number = req.body.number;
    res.send(`<h2> Hello ${name}, your number is ${number}. Your form has been submitted successfully`);
});

app.listen(port, ()=>{
    console.log(`server running at http://localhost:${port}`);
});