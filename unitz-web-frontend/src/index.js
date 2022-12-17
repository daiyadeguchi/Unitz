import React from 'react';
import ReactDOM from 'react-dom/client';
import UserList from './components/UserList';
import Navbar from './components/Navbar';
import 'bootstrap/dist/css/bootstrap.css'

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Navbar />
    <UserList />
  </React.StrictMode>
);