import xml.etree.ElementTree as ET
import streamlit as st

tree = ET.parse('movies.xml')
root = tree.getroot()

for tour in root:
    print(tour.attrib)

st.write("Movie list")
for i in root.findall('movie'):

    title = i.find("title").text
    st.header(title)
    st.image(i.find('poster').text)

    st.text(i.get("year"))
    
