val data = sc.textFile("word-count.txt")
val words = data.map(line => {var l = line.split("\\s+"); var r = l.length%2; (r, 1)})
val counts = words.reduceByKey{(x, y) => x + y}
counts.foreach(println)
