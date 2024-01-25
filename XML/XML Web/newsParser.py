import xml.etree.ElementTree as ET
import streamlit as st

st.set_page_config(layout = 'centered')

tree = ET.parse('news.xml')
root = tree.getroot()

st.markdown("<h1 style='text-align: center;'>Tänased uudised</h1>", unsafe_allow_html=True)


for news in root.findall('news/item'):
    st.header(news.find("title").text)
    st.write(news.find("description").text)
    st.image(news.find("enclosure").attrib['url'], width=700)
    st.write("Loe lähemalt postimehe veebilehel: ", news.find('link').text)
    st.write(news.find('pubDate').text)
    
    
    st.markdown("<p style = 'margin-bottom: 100px'></p>", unsafe_allow_html=True)
    
