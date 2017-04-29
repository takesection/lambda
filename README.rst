AWS Lambda
==========

::

  sbt assembly
  aws s3 cp modules/application/target/scala-2.12/aws-lambda-example.jar s3://YOUR_BACKET_NAME/
  BUCKET_NAME=YOUR_BUCKET_NAME fab sync_templates create_lambda
