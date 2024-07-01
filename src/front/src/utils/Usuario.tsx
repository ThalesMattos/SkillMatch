"use client"
import Cookies from 'js-cookie'

const _getUserData = () => {
    const userData = JSON.parse(localStorage?.getItem('skillmatch-data') ?? '{}');
    return userData;
}

const _isLoggedIn = () => {
    const userData = _getUserData();
    const isLoggedIn = userData.token && new Date(userData.expirationDate) > new Date();
    return isLoggedIn;
}

let isLoggedIn = _isLoggedIn();
let userData = _getUserData();

const refreshData = () => {
    userData = _getUserData();
    isLoggedIn = _isLoggedIn();
}


export { isLoggedIn, userData };