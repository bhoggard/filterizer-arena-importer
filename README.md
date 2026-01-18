# Filterizer arena importer

I'm learning ClojureScript programming by creating a command-line application which:

* Reads a list of URLs of art exhibitions from an [are.na](https://www.are.na/) channel.
* Uses an LLM to extract the following values
    - venue-name: The name of the gallery or venue
    - title: The title of the exhibition
    - start-date: The start date of the exhibition (format: YYYY-MM-DD)
    - end-date: The end date of the exhibition (format: YYYY-MM-DD)
    - website: The URL
* Search the Sanity studio for the art calendar to determine if the venue already exists. Create a new draft event, either with the exisiting venue, or a fallback default venue.
* Deletes the URL from the are.na channel and saves it to an archive channel.


