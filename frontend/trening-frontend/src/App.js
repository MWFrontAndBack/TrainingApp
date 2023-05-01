import { Routes, Route, } from 'react-router-dom';
import Treninginfo from "./routes/traningDesc/treningInfo";
import MainConpoment from './routes/mainComponetn/mainComponent';
import LoginRouteComp from './routes/loginRoute/loginrouteComp';
import UserPage from './routes/userpage/userpage';

function App() {
  return (
    <div>

      <Routes>
        <Route path='/' element={<MainConpoment />}></Route>
        <Route path='/train' element={<Treninginfo />}></Route>
        <Route path='/login' element={<LoginRouteComp />}></Route>
        <Route path='/user' element={<UserPage />}></Route>




      </Routes>
    </div>
  );
}

export default App;
