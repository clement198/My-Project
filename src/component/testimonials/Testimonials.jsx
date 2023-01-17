import React from 'react'
import './testimonials.css'
import AVT1 from '../../asset/avatar1.jpg'
import AVT2 from '../../asset/avatar2.jpg'
import AVT3 from '../../asset/avatar3.jpg'
import AVT4 from '../../asset/avatar4.jpg'

// import Swiper core and required modules
import { Navigation, Pagination, Scrollbar, A11y } from 'swiper';

import { Swiper, SwiperSlide } from 'swiper/react';

// Import Swiper styles
import 'swiper/css';
import 'swiper/css/navigation';
import 'swiper/css/pagination';
import 'swiper/css/scrollbar';

const avtImg = [
  {
    id: 1,
    avatar: AVT1,
    name: 'Elise Wilcox',
    review: 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis,'
  },
  {
    id: 2,
    avatar: AVT2,
    name: 'Daniel Leżuch',
    review: 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis,'
  },
  {
    id: 3,
    avatar: AVT3,
    name: 'Daniel Deiev',
    review: 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis,'
  },
  {
    id: 4,
    avatar: AVT4,
    name: 'ALLAN LAINEZ',
    review: 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis,'
  },
]

const Testimonials = () => {
  return (
    <section id='testimonial'>
      <h5>Review from clients</h5>
      <h2>Testimonials</h2>

      <Swiper className='container testimonials_container'
            // install Swiper modules
            modules={[Navigation, Pagination, Scrollbar, A11y]}
            spaceBetween={40}
            slidesPerView={1}
            pagination={{ clickable: true }}>

        {
          avtImg.map(({id , avatar , name , review}) => {
            return(
              <SwiperSlide key={id} className='testimonial'>
              <div className='client_avatar'>
                <img src={avatar} alt="" />
              </div>
              <h5 className='client_name'>{name}</h5>
              <small className='client_review'>{review}</small>
              </SwiperSlide>
            )
          })
        }
        
      </Swiper>
    </section>
  )
}

export default Testimonials