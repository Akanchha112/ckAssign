import { useNavigate } from "react-router-dom";
const Dashboard =({ setLogin })=>{
    const navigate=useNavigate();
    const onLogOut=()=>{
       console.log("User logged out");
          setLogin(false);
          localStorage.removeItem("isLoggedIn");
          navigate('/');
       }
    return<>
        <h2>Dashboard</h2>

        <button onClick={() => navigate("/counter")}>Go to Counter</button>
        <button onClick={() => navigate("/watch")}>Go to Watch</button>

        <button onClick={onLogOut}>Logout</button>
    </>
}
export default Dashboard;