Dockerized Spark App
## Create a dockerized Spark application that loads files from one or more directories

Launch docker container with command with mount:
```text
docker run -v /home/admskrzpk/spark-3.2.1-bin-hadoop3.2:/tmp/adam/ adam/spark-docker /tmp/adam/README.md
```