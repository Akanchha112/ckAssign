import {BrowserRouter, Routes,Route} from 'react-router-dom';
import { useState } from 'react';
import LoginPage from './page/LoginPage';
import Dashboard from './page/ProtectedPages/Dashboard';
import Protected from './page/ProtectedPages/Protected';
import CounterPage from './page/ProtectedPages/CounterPage';
import DigitalWatch from './page/ProtectedPages/DigitalWatch';
import UndefinedRout from './page/UndefinedRout';
function App() {
  const [isLogedin,setLogin]=useState(
  localStorage.getItem("isLoggedIn") === "true");

  return (
    <>
    {/* <LoginPage/> */}
    <BrowserRouter>
      <Routes>
        <Route path='/' element={<LoginPage setLogin={setLogin}/>}/>
        <Route path='/dashboard' element={<Protected isLogedin={isLogedin}> <Dashboard setLogin={setLogin}/> </Protected>}/>
        <Route path='/counter' element={<Protected isLogedin={isLogedin}><CounterPage/></Protected>} />
        <Route path='/watch' element={<Protected isLogedin={isLogedin}><DigitalWatch/></Protected>} />
        <Route path='*' element={<UndefinedRout/>} />

      </Routes>
    </BrowserRouter>
    </>
  )
}

export default App
