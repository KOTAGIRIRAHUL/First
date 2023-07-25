import axios from 'axios';
import { useEffect, useState } from 'react';

function App() {

  const [data, setData] = useState([]);

  const getData = async() => {
    const res = await axios.get('http://localhost:7389/first/get')
    setData(res.data);
    console.log(res.data)
  }

  

  useEffect(() => {
    getData();
  },[])

  return (
    <div className="App">
      {data?.map((item) => (
        <>
          <div>{item.id}</div>
        <div>{item.firstName}</div>
        <div>{item.lastName}</div>
        <div>{item.address}</div>
        </>
      ))}
    </div>
  );
}

export default App;
