import { useState, useEffect } from "react";
import "./App.css";
import axios from "axios";

export default function App() {

  const [data, setData] = useState([]);
  const [err, setErr] = useState(null);

  useEffect(() => {
    axios.get("http://localhost:8080/student")
      .then((res) => setData(res.data))
      .catch((err) => setErr(err.toString()))
  }, [])


  return (
    <div className="App">
      {err && <p>{err}</p>}
      {data.length > 0 && <div>
        <table>
          <tr>
            <th>
              Name
            </th>
            <th>
              Age
            </th>
            <th>
              Current Expenses
            </th>
          </tr>
          {data.map((d) => 
          <>
          <tr>
            <td>{d.name}</td>
            <td>{d.age}</td>
            <td>{d.currentExpenses}</td>
          </tr>
          </>)}
        </table>
        <button>Make new transaction</button>
          <form>
            
          </form>
        </div>}
    </div>
  );
}