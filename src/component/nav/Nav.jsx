/* eslint-disable jsx-a11y/anchor-is-valid */
import React , {useState} from 'react'
import './nav.css'
import {FaHome} from 'react-icons/fa'
import {FaUser} from 'react-icons/fa'
import {FaFileAlt} from 'react-icons/fa'
import {FaNetworkWired} from 'react-icons/fa'
import {AiFillMessage} from 'react-icons/ai'


const Nav = () => {

  const [activeNav , setActiveNav] = useState('#');

  return (
    <nav>
      <a href="#" onClick={() => setActiveNav("#")} className={activeNav === '#' ? 'active' : ''}><FaHome /></a>
      <a href="#about" onClick={() => setActiveNav("#about")} className={activeNav === '#about' ? 'active' : ''} ><FaUser /></a>
      <a href="#experience" onClick={() => setActiveNav("#experience")} className={activeNav === '#experience' ? 'active' : ''} ><FaFileAlt /></a>
      <a href="#services" onClick={() => setActiveNav("#services")} className={activeNav === '#services' ? 'active' : ''} ><FaNetworkWired /></a>
      <a href="#contact" onClick={() => setActiveNav("#contact")} className={activeNav === '#contact' ? 'active' : ''} ><AiFillMessage /></a>
    </nav>
  )
}

export default Nav