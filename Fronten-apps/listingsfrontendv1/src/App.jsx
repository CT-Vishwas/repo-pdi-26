// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
import './App.css'
import Layout from './components/layout/Layout'
import AppRoutes from './routes/AppRoutes';

function App() {
  // const [count, setCount] = useState(0)

  return (
    <Layout>
      <AppRoutes />
    </Layout>
  )
}

export default App
