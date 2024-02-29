import React from 'react';
import ReactDOM from 'react-dom/client';


//import App from './App';
//import AppClass from './AppClass';
//import HelloWorld from './HelloWorld';
//import Hello from './Hello';
//import Square from './components/Square';
import './style.css';
import Board from './components/Board';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
   <Board />
  </React.StrictMode>
);
/**
root.render(
  <React.StrictMode>
    <App />
    <AppClass />
    <HelloWorld />
    <Hello />
  </React.StrictMode>
);

 */