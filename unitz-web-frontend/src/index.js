import React from 'react';
import ReactDOM from 'react-dom/client';
import Navbar from './components/Navbar';
import UserList from './components/UserList'
import 'bootstrap/dist/css/bootstrap.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Navbar />
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<UserList />} />
      </Routes>
    </BrowserRouter>
  </React.StrictMode>
);