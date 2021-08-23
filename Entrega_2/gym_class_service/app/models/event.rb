class Event < ApplicationRecord
  belongs_to :gym_class
  has_many :participations
end
