import { useState ,useEffect} from 'react';
function DigitalWatch() {
  const [time, setTime] = useState(new Date())

  useEffect(() => {
    const timer = setInterval(() => {
      setTime(new Date())
    }, 1000)

    return () => clearInterval(timer)
  }, [])

  return (
    <>
      <h2>Digital Watch</h2>
      <p>{time.toLocaleTimeString()}</p>
    </>
  )
}

export default DigitalWatch
