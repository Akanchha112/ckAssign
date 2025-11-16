import { useState } from 'react';
function CounterPage() {
  const [count, setCount] = useState(0)

  return (
    <>
      <h2>Counter Page</h2>
      <p>Value: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increase</button>
      <button onClick={() => setCount(count - 1)}>Decrease</button>
    </>
  );
}

export default CounterPage;
