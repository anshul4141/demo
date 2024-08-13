const express = require('express');
const cors = require('cors');
const bodyParser = require('body-parser');

const app = express();

app.use(bodyParser.json());
app.use(cors());

const port = 5000;

app.listen(port, () => {
    console.log('hello express js ' + `http://localhost:${port}`);
})