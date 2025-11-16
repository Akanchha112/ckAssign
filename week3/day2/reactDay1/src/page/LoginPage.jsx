import { Navigate, useNavigate } from "react-router-dom";

const LoginPage = ({ setLogin }) => {
  const navigate = useNavigate();

  const onLogin = () => {
    console.log("User logged in");
    setLogin(true);
    localStorage.setItem("isLoggedIn", "true");
    navigate('/dashboard', { replace: true });
  };

  return (
    <>
      <button onClick={onLogin}>Login</button>
    </>
  );
};

export default LoginPage;

// Errors
{/* <button onClick={onLogin()}>Login</button>

This executes onLogin() during render, not on button click. */}
