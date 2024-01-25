import xml.etree.ElementTree as ET
import streamlit as st
from streamlit_card import card
st.set_page_config(layout = 'wide')

        
tree = ET.parse('movies.xml')
root = tree.getroot()



st.markdown("# Today's movies recommendations")

#for movie in root.findall('movies/movie'):
#    title = movie.get('title')
#    st.write(title)
#    poster = movie.get('poster')
#    st.image(poster)
#    st.write("Genre: ", movie.get('genre'))
#    st.write("Country: ", movie.get('country'))
#    st.write("Actors: ", movie.get('actors'))
#    st.write(movie.get('plot'))
#    st.write("Rating: ", movie.get('imdbRating'))


for movie in root.findall('movies/movie'):
    movieCard = card(
        title = movie.get('title'),
        text = [movie.get('plot'),
                " - ",
                ("Genre: ",movie.get('genre')),
                ("Country: ",movie.get('country')),
                ("Rating: ",movie.get('imdbRating')),],
        image = movie.get('poster'),
        styles = {
            "card":{
                "width": "720px",
                "height": "1080px",
                "padding": "50px"
                }

        }
    )

#for tour in root:
#    print(tour.attrib)

#st.write("Movie list")
#for i in root.findall('movie'):

#    title = i.find("title").text
#    st.header(title)
#    st.image(i.find('poster').text)

#    st.text(i.get("year"))
