import React, { useRef } from 'react';
import './contact.css';
import {AiOutlineMail} from 'react-icons/ai';
import {RiMessengerLine} from 'react-icons/ri';
import {BsWhatsapp} from 'react-icons/bs';
import emailjs from 'emailjs-com';

const Contact = () => {

  const form = useRef();
  
  const sendEmail = (e) => {
    e.preventDefault();

    emailjs.sendForm('service_fslaiut', 'template_ak3lsjd', form.current, '6enY7z_3gMmLTCceG')
    e.target.reset()
  };

  return (
    <section id="contact">
      <h5>Get In Touch</h5>
      <h2>Contact Me</h2>

      <div className='container contact_container'>
        <div className='contact_options'>
          <article className='contact_option'>
            <AiOutlineMail className='contact_option_icon'/>
            <h4>Email</h4>
            <h5>lmdih@hotmail.com</h5>
            <a href='mailto:lmdih@hotmail.com' target="_blank">Send a message</a>
          </article>

          <article className='contact_option'>
            <RiMessengerLine className='contact_option_icon' />
            <h4>Messenger</h4>
            <h5>Mike Myers</h5>
            <a href='http://m.me/giap.clement' target="_blank">Send a message</a>
          </article>

          <article className='contact_option'>
            <BsWhatsapp className='contact_option_icon' />
            <h4>Whatsapp</h4>
            <h5>+60123456789</h5>
            <a href='https://api.whatsapp.com/send?phone=601117978603' target="_blank">Send a message</a>
          </article>
        </div>
        <form ref={form} onSubmit={sendEmail}>
          <input type="text" name='name' placeholder='Your Name' required/>
          <input type="email" name='email' placeholder='Your Email Address' required/>
          <textarea name='message' rows="7" placeholder='Type Your Messege Here' required></textarea>
          <button type='submit' className='btn btn-primary'>Send Message</button>
        </form>
      </div>
    </section>
  )
}

export default Contact