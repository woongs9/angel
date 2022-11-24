    let bottomMenuToggle = document.querySelector(".bottomMenuToggle");
    let overlay = document.querySelector(".overlay");
    bottomMenuToggle.onclick = function () {
        bottomMenuToggle.classList.toggle("active");
        overlay.classList.toggle("active");
        firstPage.classList.remove("active");
        secondPage.classList.remove("active");
        thirdPage.classList.remove("active");
        fourthPage.classList.remove("active");
    }
    let listPage = document.querySelector(".listPage");
    let listIcon = document.querySelector(".listIcon");
    let firstPageIcon = document.querySelector("#firstPageIcon");
    let secondPageIcon = document.querySelector("#secondPageIcon");
    let thirdPageIcon = document.querySelector("#thirdPageIcon");
    let fourthPageIcon = document.querySelector("#fourthPageIcon");
    let firstPage = document.querySelector(".firstPage");
    let secondPage = document.querySelector(".secondPage");
    let thirdPage = document.querySelector(".thirdPage");
    let fourthPage = document.querySelector(".fourthPage");
        firstPageIcon.onclick = function () {
            firstPage.classList.toggle("active");
            secondPage.classList.remove("active");
            thirdPage.classList.remove("active");
            fourthPage.classList.remove("active");
       }
       secondPageIcon.onclick = function () {
            firstPage.classList.remove("active");
            secondPage.classList.toggle("active");
            thirdPage.classList.remove("active");
            fourthPage.classList.remove("active");
       }
       thirdPageIcon.onclick = function () {
            firstPage.classList.remove("active");
            secondPage.classList.remove("active");
            thirdPage.classList.toggle("active");
            fourthPage.classList.remove("active");
       }
       fourthPageIcon.onclick = function () {
            firstPage.classList.remove("active");
            secondPage.classList.remove("active");
            thirdPage.classList.remove("active");
            fourthPage.classList.toggle("active");
       }

       overlay.onclick = function () {
            firstPage.classList.remove("active");
            secondPage.classList.remove("active");
            thirdPage.classList.remove("active");
            fourthPage.classList.remove("active");
            bottomMenuToggle.classList.remove("active");
            overlay.classList.remove("active");
            listPage.classList.remove("active");
       }

        listIcon.onclick = function () {
            listPage.classList.add("active");
            overlay.classList.add("active");
            }