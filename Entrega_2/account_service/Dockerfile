FROM ruby:2.7.4-slim-buster

RUN apt-get update -qq && apt-get install -y build-essential patch zlib1g-dev liblzma-dev libpq-dev nodejs imagemagick default-jre libxslt-dev libxml2-dev mariadb-client  default-libmysqlclient-dev

RUN mkdir /rails_app
WORKDIR /rails_app

COPY ./Gemfile /rails_app/Gemfile
COPY ./Gemfile.lock /rails_app/Gemfile.lock

# Prevent bundler warnings; ensure that the bundler version executed is >= that which created Gemfile.lock
RUN gem install bundler -v '~> 1.15'
RUN bundle install

# Copy the main application.
COPY . /rails_app

CMD bundle exec puma -C config/puma.rb