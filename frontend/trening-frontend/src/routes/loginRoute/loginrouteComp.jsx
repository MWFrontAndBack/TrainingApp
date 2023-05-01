import { Link } from "react-router-dom";
import Logincomponent from "../../components/login/loginComponent";
import Navbar from "../../components/navbar/navbar";

const LoginRouteComp = () => {
  return (
    <div>
      <Navbar />
      <Logincomponent />
      <Link to={"/user"}>Login</Link>
    </div>
  );
};
export default LoginRouteComp;
