import "../../assets/css/Login.css";
import CustInput from "../../components/CustInput";
import Custbtn from "../../components/Custbtn";

function Login()
{
    return(
        <>
            <div className="login">
                <h1>LOGIN</h1>
                <CustInput type="text" lable="Username"/>
                <CustInput type="password" lable="Password"/>
                <Custbtn lable="Login"/>
            </div>
        </>
    )

}

export default Login;