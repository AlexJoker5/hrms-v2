import { useState, useEffect } from 'react';

function App() {

  const [ message, setMessage ] = useState("");

  useEffect(() => {
    fetch("http://localhost:8080/api/home")
      .then(res => res.text())
      .then(data => setMessage(data));
  }, []);

  return (
    <div style={{ padding: "2rem", fontSize: "24px" }}>
      {message}
    </div>
  )
  
}

export default App
