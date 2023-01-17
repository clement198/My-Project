import React from 'react'
import './portfolio.css'
import IMG1 from '../../asset/portfolio1.jpg'
import IMG2 from '../../asset/portfolio2.jpg'
import IMG7 from '../../asset/portfolio7.jpg'
import IMG4 from '../../asset/portfolio4.jpg'
import IMG5 from '../../asset/portfolio5.jpg'
import IMG6 from '../../asset/portfolio6.jpg'

const myImg = [
  {
    id : 1,
    image: IMG1,
    title: 'Shopable Video Apps',
    github: 'https://github.com',
    demo: 'https://dribbble.com/shots/19695997-Shopbizz-Shopable-Video-Apps'
  }, 
  {
    id: 2,
    image: IMG2, 
    title: 'Furniture Store Website Page Design',
    github: 'https://github.com',
    demo: 'https://dribbble.com/shots/19625382-Pramega-Furniture-Store-Website-Page-Design'
  },
  {
    id: 3,
    image: IMG7, 
    title: 'Marketplace Website Templ',
    github: 'https://github.com',
    demo: 'https://dribbble.com/goods/1118821-NFT-SFeo-Marketplace-Website-Templ?token=gAAAAABjVVRjz879Y6SJDVbN5tUtZupWEmSFAepT20e_lR9pTlP1q3CBmlj5s_MUJoFuOkFq_WwAsgRtxGRy_HVRCwx9iSNQFgmWDkjspKwvm28Oru7H_Rlr61M_1A1x_TLjfaqlgddWCyfpOYkorQfLgUiwbCazy4H6a30ZyysT3T25_qU-73E%3D'
  },
  {
    id: 4,
    image: IMG4, 
    title: 'Fashion Store Mobile App',
    github: 'https://github.com',
    demo: 'https://dribbble.com/shots/19464755-Styleen-fashion-store-mobile-app'
  },
  {
    id: 5,
    image: IMG5, 
    title: 'Sports venue booking',
    github: 'https://github.com',
    demo: 'https://dribbble.com/shots/19365567-Zporty-Sports-venue-booking'
  },
  {
    id: 6,
    image: IMG6, 
    title: 'NFT Marketplace Website Design',
    github: 'https://github.com',
    demo: 'https://dribbble.com/shots/19708942-NFT-Marketplace-Website-Design'
  },
]

const Portfolio = () => {
  return (
    <section id='portfolio'>
      <h5>My Recent Work</h5>
      <h2>Portfolio</h2>

      <div className='container portfolio_container'>

        {
          myImg.map(({id,image,title,github,demo}) => {
            return (
              <article key={id} className='portfolio_item'>
              <div className='portfolio_item_image'>
                <img src={image} alt={title} />
              </div>
              <h3>{title}</h3>
              <div className='portfolio_item_cta'>
              <a href='https://github.com/' className='btn'>Github</a>
              <a href={demo} className='btn btn-primary'>Live Demo</a>
              </div>
            </article>
            )
          })
        }

      </div>
    </section>
  )
}

export default Portfolio