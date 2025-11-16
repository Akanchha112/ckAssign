import { Navigate } from "react-router-dom";
const Protected=({isLogedin,children})=>{
    if (!isLogedin) {
      console.log("Access denied");
        return <Navigate to="/" replace />; //what is the meaning of replace here
    }
    console.log("Access provided");
  return children;
}
export default Protected;
