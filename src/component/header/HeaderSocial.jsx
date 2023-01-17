import React from 'react'
import {BsInstagram} from 'react-icons/bs'
import {BsGithub} from 'react-icons/bs'
import {BsFacebook} from 'react-icons/bs'

const HeaderSocial = () => {
  return (
    <div className='header_social'>
      <a href="https://www.instagram.com/" target="#blank">
        <BsInstagram/>
      </a>
      <a href="https://github.com/" target="#blank">
        <BsGithub/>
      </a>
      <a href="https://www.facebook.com/" target="#blank">
        <BsFacebook/>
      </a>
    </div>
  )
}

export default HeaderSocial