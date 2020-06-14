import React from 'react';  
import logo from './logo.svg';  
import './App.css';  
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import Login from './Login';  
import Signup from './Signup'; 
import DashBoard from './DashBoard';   
import { BrowserRouter as Router, Switch, Route, Link } from 'react-router-dom';   
function App() {  
  return (  
    <Router>    
      <div className="App">    
      <nav className="navbar navbar-expand-lg navbar-light fixed-top">
        <div className="container">
          <div className="collapse navbar-collapse" id="navbarTogglerDemo02">
            <ul className="navbar-nav ml-auto">
              <li className="nav-item">
                <Link className="nav-link" to={"/login"}>Login</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to={"/signup"}>Sign up</Link>
              </li>
              <li className="nav-item">
                <Link className="nav-link" to={"/DashBoard"}>DashBoard</Link>
              </li>
            </ul>
          </div>
        </div>
      </nav><br />    
        <Switch> 
          <Route exact path='/' component={Login} />
          <Route exact path='/Login' component={Login} />         
          <Route exact path='/Signup' component={Signup} />       
          <Route exact path='/DashBoard' component={DashBoard} />      
        </Switch>    
      </div>    
    </Router>   
  );  
}  
  
export default App;
