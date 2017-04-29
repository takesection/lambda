from fabricawscfn import *
import os

bucket_name = os.environ.get('BUCKET_NAME')

StackGroup(
  bucket_name, 'lambda-templates', 'cloudformation'
).define_stack(
  'lambda', 'lambda', 'lambda.yaml', Capabilities=['CAPABILITY_NAMED_IAM']
).generate_task(globals())
