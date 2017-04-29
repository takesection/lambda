AWS Lambda
==========

* `fabric-aws-cloudformation <https://github.com/crossroad0201/fabric-aws-cloudformation>`_

::

  sbt assembly
  aws s3 cp modules/application/target/scala-2.12/aws-lambda-example.jar s3://YOUR_BACKET_NAME/
  BUCKET_NAME=YOUR_BUCKET_NAME fab sync_templates create_lambda
