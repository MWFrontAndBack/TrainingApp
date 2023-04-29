import { Routes, Route, } from 'react-router-dom';
import Treninginfo from "./routes/traningDesc/treningInfo";
import MainConpoment from './routes/mainComponetn/mainComponent';
import LoginRouteComp from './routes/loginRoute/loginrouteComp';

function App() {
  return (
    <div>

      <Routes>
        <Route path='/' element={<MainConpoment />}></Route>
        <Route path='/train' element={<Treninginfo />}></Route>
        <Route path='/login' element={<LoginRouteComp />}></Route>




      </Routes>
    </div>
  );
}

export default App;
