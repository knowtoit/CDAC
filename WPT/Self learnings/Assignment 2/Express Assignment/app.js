const express = require('express');
const app = express();
const port = 3000;

// Middleware to parse form data
app.use(express.urlencoded({ extended: true }));

// Route 1 - Home Page
app.get('/', (req, res) => {
    res.send("<h1>Welcome to My Express App</h1>");
});

// Route 2 - About Page
app.get('/about', (req, res) => {
    res.send("<h2>This is About Page</h2>");
});

// Route 3 - Contact Page
app.get('/contact', (req, res) => {
    res.send("<h2>Contact us at: example@email.com</h2>");
});

// Route 4 - Show Form
app.get('/form', (req, res) => {
    res.send(`
        <h2>Enter Your Name</h2>
        <form method="POST" action="/submit">
            Name: <input type="text" name="name">
            <button type="submit">Submit</button>
        </form>
    `);
});

// Route 5 - Handle Form Submission
app.post('/submit', (req, res) => {
    const name = req.body.name;
    res.send(`<h2>Hello ${name}, form submitted successfully!</h2>`);
});

// Start server
app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});