import Footer from "../components/layout/Footer";
import Header from "../components/layout/Header";
export default function HomePage(){
    return(
        <>
        <Header />
        <div class="object-fill">
<div class="flex ...">
  <div class="flex-1 ...">01</div>
  <div class="contents">
    <div class="flex-1 ...">02</div>
    <div class="flex-1 ...">03</div>
  </div>
  <div class="flex-1 ...">04</div>
</div>
        </div>
        <Footer />
        </>
    )
}