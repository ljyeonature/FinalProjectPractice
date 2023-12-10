import React, {useState, useEffect} from "react";
import axios from 'axios'
import './App.css';

function App() {
  const [ message, setMessage ] = useState('');
  const [date, setDate] = useState('');
  
  useEffect(() => {
    axios.get("/greeting")
      .then(res => setMessage(res.data))
      .catch(err => console.log(err))
  }, []);

  useEffect(() => {
    fetch("/getNow")
      .then(res => res.text())
      .then(data => setDate(data))
      .catch(err => console.log(err))
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <p>받아온 결과</p>
        <div>{message}</div>
        <div>{date}</div>
      </header>
    </div>
  );
}


export default App;
