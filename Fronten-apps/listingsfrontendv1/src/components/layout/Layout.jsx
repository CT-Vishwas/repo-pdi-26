import './Header';
import './Footer';
import Header from './Header';
import Footer from './Footer';

function Layout({ children }) {
    return ( 
        <div  className='flex min-h-full flex-col' >
            <Header />
            <div >
                { children }
            </div>
            <Footer />
        </div>        
     );
}

export default Layout;