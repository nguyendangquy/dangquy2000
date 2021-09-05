import React, { Component } from 'react'
import PropTypes from 'prop-types';
import './style.css'
// Router
import { BrowserRouter as Router, Route, Switch, Link } from 'react-router-dom';

window.onload = function () {
    const themeBtn = document.getElementById('toggleBtn');
    themeBtn.addEventListener('click', function () {
        // Lấy thuộc tính data-theme
        const root = document.querySelector(':root');
        const isLightMode =
            root.getAttribute('data-theme') === 'dark' ? false : true;
        // toggle theme mode
        if (isLightMode) {
            root.setAttribute('data-theme', 'dark');
        } else {
            root.setAttribute('data-theme', 'light');
        }
        // thay đổi vị trí của button
        this.classList.toggle('active');
    });
};

export default class Header extends Component {
    // eslint-disable-next-line no-useless-constructor
    constructor(props) {
        super(props);
    }
    render() {
        const { branding } = this.props;
        return (
            <div>
                <nav className="
                    navbar 
                    navbar-expand-sm 
                    navbar-dark bg-danger
                    mb-3 py-0">
                    <div className="container">
                        <a href="/" className="navbar-brand">{branding}</a>
                        <div>
                            <ul className="navbar-nav mr-auto">
                                <li className="nav-item">
                                    <Link to="/" className="nav-link">
                                        <i className="fas fa-home"></i>
                                        Home
                                    </Link>
                                </li>
                                <li className="nav-item">
                                    <Link to="/addcontact" className="nav-link">
                                        <i className="fas fa-plus"></i>
                                        Add Contact
                                    </Link>
                                </li>
                                <li className="nav-item">
                                    <Link to="/about" className="nav-link">
                                        <i className="fas fa-question"></i>
                                        About
                                    </Link>
                                </li>
                                <li className="nav-item">
                                    <Link to="/albums" className="nav-link">
                                        <i className="fas fa-question"></i>
                                        Album
                                    </Link>
                                </li>
                                {/* <div className="wrapper">
                                    <div className="box">
                                        <h1 className="title">Toggle Dark Mode</h1>
                                     
                                    </div>
                                </div> */}

                                <div id="toggleBtn"></div>
                            </ul>
                        </div>

                    </div>
                </nav>
            </div>
        )
    }
}

Header.defaultProps = {
    branding: 'My app'
}

Header.propTypes = {
    branding: PropTypes.string.isRequired
}

const headingStyle = {
    color: 'red',
    fontSize: '3rem'
}