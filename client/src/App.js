import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css'
import './App.css';

import TopMenuComponent from "./router/TopMenuComponent";

function App() {
  return (
/*      <div>
        <h1>hello</h1>
      </div>*/
      <div className="App">
        <div>
          <TopMenuComponent>
          </TopMenuComponent>
        </div>
      </div>
  );
}

export default App;
