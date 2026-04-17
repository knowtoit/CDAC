const http = require('http');
const querystring = require('querystring');

const server = http.createServer((req, res)=>{
    if(req.method ==='GET' && req.url ==="/"){
        res.writeHead(200,{'content-type':'text/html'});

        res.write(`
            <h2>Simple Node Js Application</h2>
            <form method="POST" action = "/submit">
            Name : <input type="text" name ="name"><br>
            Age: <input type="text" name="age"><br>
            <input type="submit" value="submit">
            </form>
            `);
            res.end();
    }

    else if(req.method === "POST" && req.url === "/submit"){
        let body ='';

        req.on('data', chunk =>{
            body += chunk.toString();
        });

        req.on('end', ()=>{
            const data = querystring.parse(body);

            res.writeHead(200, {'content-type': 'text/html'});

            res.write(`<h2>Form Data Received</h2>`);
            res.write(`<p>Name: ${data.name}</p>`);
            res.write(`<p>Age: ${data.age}</p>`);

            res.end();
        });
    }
});

server.listen(3000, ()=>{
    console.log("Server running")
});