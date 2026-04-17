const express = require("express");

const app = express();

app.set("view engine", "ejs");

app.use(express.urlencoded({extended:true}));

const students = [
    {name: "Sai", course: "Node Js"},
    {name: "Tejal", course: "React JS"}
];

app.get("/", (req, res)=>{
    res.render("index");
});

app.get("/students", (req, res)=>{
    res.render("students", {students:students});
});

app.get("/add", (req,res)=>{
    res.render("addStudent");
});

app.post("/add", (req,res)=>{
    const {name, course} = req.body;
    students.push({name, course});
    res.redirect("/students");
});

app.listen(3000, ()=>{
    console.log("server is running at http://localhost:3000");
});