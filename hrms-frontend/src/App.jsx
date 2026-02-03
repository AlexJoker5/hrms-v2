import { useState, useEffect } from 'react';
import { Link, Route, Routes } from 'react-router-dom';

function App() {

  const [ message, setMessage ] = useState("");

  useEffect(() => {
    fetch("http://localhost:8080/api/home")
      .then(res => res.text())
      .then(data => setMessage(data));
  }, []);

  return (
    <div>

      <div style={{ padding: "1rem" }}>
        <Link to="/">
          <button>Home</button>
        </Link>

        <Link to="/about">
          <button>About Us</button>
        </Link>
      </div>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
      </Routes>
    </div>
  )
  
}

export default App
