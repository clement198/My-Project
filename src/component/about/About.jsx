import React from 'react'
import './about.css'
import me from '../../asset/me3.jpg'
import {FaMedal} from 'react-icons/fa'
import {IoIosPeople} from 'react-icons/io'
import {AiOutlineProject} from 'react-icons/ai'

const About = () => {
  return (
    <section id="about">
      <h5>Let's Get To Know</h5>
      <h2>About Me</h2>

      <div className='container about_container'>
        <div className='about_me'>
          <div className='about_me_image'>
            <img src={me} alt="AboutImg" />
          </div>
        </div>

        <div className='about_content'>
          <div className='about_cards'>
            <article className='about_card'>
              <FaMedal className='about_icon'/>
              <h5>Experience</h5>
              <small>2+ Years Working</small>
            </article>

            <article className='about_card'>
              <IoIosPeople className='about_icon'/>
              <h5>Clients</h5>
              <small>200+ Worldwide</small>
            </article>

            <article className='about_card'>
              <AiOutlineProject className='about_icon'/>
              <h5>Projects</h5>
              <small>80+ Completed</small>
            </article>
          </div>

          <p>
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolore ipsum doloribus facere illo placeat saepe, assumenda aspernatur ratione fuga distinctio dolor adipisci, consectetur non voluptate repudiandae laudantium enim. Ea, dicta!
          </p>
          <a href='#contact' className='btn btn-primary'>Let's Talk</a>
        </div>
      </div>
    </section>
  )
}

export default About