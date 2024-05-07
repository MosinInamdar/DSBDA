val data = Array(1,2,3,4,5,6)
var distdata = sc.parallelize(data)

val mappedData = distdata.map(x => x*x)
println(mappedData.collect().mkString(","))
