const api_url = 'https://randomuser.me/api'
async function getUser(){
    const response = await fetch(api_url);
    const data = await response.json();

    console.log(data.results);

    let user = data.results[0];

    let {title, first, last} = user.name;
    let {email} = user;
    let {city,state,country} = user.location;
    let {medium} = user.picture;

    let fullname = title + ". "+first +" "+ last;
    
    // get userinfo
    let userinfo = document.getElementById('userinfo');
    let newEle = document.createElement('h4');

    newEle.textContent = fullname;
    userinfo.appendChild(newEle);

    let thumbnailPic = document.getElementById('thumbnail');
    thumbnailPic.setAttribute("src", medium );
}