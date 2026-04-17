// Write a program to create a new file and write some content to it in synchronous mode and
// read and display file contents on standard output in async mode




const fs = require("fs");

fs.writeFileSync("fileHandleText.txt", "This file has been created using synchronous method in Node");

console.log("Sync File created and written Successfully!");

fs.readFile("fileHandleText.txt", "utf-8", (err, data)=>{
    if(err){
        console.log("Error in reading file", err);
        return;
    }

    console.log("File read in async mode");
        console.log(data);
    
});