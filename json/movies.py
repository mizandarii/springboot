import json
import streamlit as st

st.set_page_config(layout = 'centered')

with open('movies.json') as f:
    data=json.load(f)
movies=data['results']

st.markdown("<h1 style='text-align: center;'>Today's movie picks</h1>", unsafe_allow_html=True)
#genresList =[]

#json.dumps(movies, indent=2)

#for movie in movies:
#    genresList.append(movie["Genre"])

#genresClean = [] 
#for i in genresList: 
#    if i not in genresClean: 
#        genresClean.append(i)

#st.write(genresClean)

# Extract unique genres
genres = set(movie['Genre'] for movie in movies)

# Allow the user to select a genre
selected_genre = st.selectbox('Select a genre:', sorted(list(genres)))

# Filter movies based on the selected genre
selected_movies = []
 
for movie in movies:
    if selected_genre in movie['Genre']:
        selected_movies.append(movie)

# Sort movies by genre and title
sorted_movies = sorted(selected_movies, key=lambda x: (x['Genre'], x['Title']))

n = 1
for movie in sorted_movies:
    st.write("Movie number" + str(n))
    st.write("Title:", movie['Title'])
    st.write("Year:", movie['Year'])
    st.write("Genre:", movie['Genre'])
    st.write("Plot:", movie['Plot'])
    st.image(movie['Poster'])
    st.write("Cast:", movie['Actors'])
    n+=1
 

