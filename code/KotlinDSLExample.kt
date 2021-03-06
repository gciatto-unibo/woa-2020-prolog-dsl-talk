html {
  head {
    title {+"HTML encoding with Kotlin"}
  }
  body {
    h1 {+"HTML encoding with Kotlin"}
    p {+"a DSL can be used as an alternative markup to HTML"}
    
    // an element with attributes and text content
    a(href = "http://kotlinlang.org") {+"Kotlin"}
    
    // content generated by
    p {
      for (item in list)
        +item
    }
  }
}
