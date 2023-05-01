import "./navbarstyle.css";
import logo from "../../assets/avatar.svg";
import { Link } from "react-router-dom";

const Usernavbar = () => {
  return (
    <div className="navigation-container">
      <nav>
        <ul>
          <li>
            <Link to={"/"}>Logout</Link>
          </li>
          <li>
            <Link to={"/train"}>MyDiets</Link>
          </li>
          <li>
            <Link to={"/about"}>Trainings</Link>
          </li>
          <li>
            <Link to={"/login"}>Account</Link>
          </li>
          <li>
            <img src={logo} alt="Logo" />
          </li>
        </ul>
      </nav>
    </div>
  );
};

export default Usernavbar;
